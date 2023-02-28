#include <iostream>
#include <fstream>
#include <sstream>
#include <map>
#include <random>
#include <ctime>
#include <vector>


using namespace std;
mt19937 random_mt;
void RollDice(int, int);
class data {
public:
	string name;
	int income_per_capita;
	int popul;
	int m_household_income;
	int households_count;
};
int Random(int min, int max) {
	uniform_int_distribution<int> dist(min, max);
	return dist(random_mt);
}
void print_info(data);
void read(string);
map<int, int> map1;
map<string, data> map2;
int main() {
	int opt_state;
	int choise;
	string state_title;
	cout << "1. Random Numbers\n";
	cout << "2. State Info\n";
	cin >> choise;
	if (choise == 1) {
		int sides_count;
		int randomSeed;
		int roll_count;

		cout << "Random seed value: ";
		cin >> randomSeed;
		random_mt.seed(randomSeed);
		cout << "Number of times to roll the die: ";
		cin >> roll_count;
		cout << "Number of sides on this die: ";
		cin >> sides_count;
		RollDice(roll_count, sides_count);

		for (int i = 1; i <= sides_count; i++) {
			cout << i << ": " << map1[i] <<"\n";
		}
	} else if (choise == 2) {
		bool check = false;
		cout << "1. Print all states\n";
		cout << "2. Search for a state\n";
		cin >> opt_state;
		map<string, data>::iterator i;
		read("states.csv");
		if (opt_state == 1) {
			for (i = map2.begin(); i != map2.end(); i++) {
				print_info((*i).second);
			}
		}
		if (opt_state == 2) {
			cin >> state_title;
			for (i = map2.begin(); i != map2.end(); i++) {
				if (state_title == (*i).first) {
					print_info((*i).second);
					check = true;
					break;
				}
			}
			if (!check)
				cout << "No match found for " << state_title <<"\n";
		}
	}
	return 0;
}
void RollDice(int numberOfRolls, int numberOfSides) {
	vector<int> randomArray;
	int counter = 0;
	for (int y = 0; y < numberOfRolls; y++) {
		randomArray.push_back(Random(1, numberOfSides));
	}
	for (int z = 1; z <= numberOfSides; z++) {
		for (int x = 0; x < numberOfRolls; x++) {
			if (z == randomArray[x]) {
				counter++;
			}
		}
		map1.emplace(z, counter);
		counter = 0;
	}
}

void print_info(data state) {
    cout << state.name <<"\nPopulation: " << state.popul <<"\nPer Capita Income: " << state.income_per_capita <<"\nMedian Household Income: " << state.m_household_income <<"\nNumber of Households: " << state.households_count <<"\n";
}


void read(string filename) {
	int counter = 0;
	fstream file(filename, ios_base::in); //open file for input
	string info;
	string newString = "";
	if (file.is_open()) {
		while (getline(file, info)) { //get each line of the file
			if (counter >= 1) { //skip first line
				newString = newString + info + ","; //append line to newString
			}
			counter++;
		}
	}
	file.close();
	stringstream read(newString); //create stringstream object
	info = "lol";
	while (getline(read, info, ',')) { //split the string by ','
		data state;
		state.name = info;
		getline(read, info, ',');
		state.income_per_capita = stoi(info); //store the income per capita in the object
		getline(read, info, ',');
		state.popul = stoi(info); //store the population in the object
		getline(read, info, ',');
		state.m_household_income = stoi(info); //store the median household income in the object
		getline(read, info, ',');
		state.households_count = stoi(info); //store the number of households in the object
		map2.emplace(state.name, state);
	}
}