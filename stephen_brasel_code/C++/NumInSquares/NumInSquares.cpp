// NumInSquares.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
int numInSquares(int n, int x);

int numInSquares(int n, int x) {
	if (n <= 0 || x <= 0 || x > n * n) return 0;
	int i = 0, count = 0;
	while (++i * i < x)
		if (x % i == 0 && x <= n * i) count += 2;
	return i * i == x ? count + 1 : count;
}

int main()
{
	for (size_t i = 0; i < 100; i++)
	{
		for (size_t j = 0; j < 100; j++)
		{
			std::cout << i << ": " << j << ",\t"  << numInSquares(i, j) << "\n";
		}
	}
	system("pause");
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
