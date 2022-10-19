# algorithms
my solutions for some algorithmic tasks
1) algor1 - Your task is to help calculate for each candidate his cipher. 
Input Format:
The first line contains the number N(1 ≤ N ≤ 10 000) — the number of candidates and ciphers.
This is followed by N lines in CSV format (f<sub>j</sub> ,i<sub>j</sub>, o<sub>j</sub>, d<sub>j</sub>, m<sub>j</sub>, y<sub>j</sub>) — information about the candidates: Last name f<sub>j</sub>, first name i<sub>j</sub> and patronymic oj(1 ≤ ∣f<sub>j</sub>∣, ∣i<sub>j</sub>∣, ∣o<sub>j</sub>∣ ≤ 15) — strings consisting of upper and lower case Latin letters; birthday d<sub>j</sub>, month of birth mj<sub>j</sub> and year of birth y<sub>j</sub> are integers giving a valid date between January 1, 1950 until December 31, 2021.
Output Format:
In a single line print N lines of k1<sub>1</sub>, k<sub>2</sub>, … , k<sub>N</sub> , where k<sub>j</sub> is the cipher of the j-th candidate (in upper case). Candidates are numbered 1 to N in order of entry.
2) algor2 - Your task is to examine the log for the past year and determine for each rocket the total travel time (in minutes) during orders. At each moment of time, the rocket fulfills only one order. We will assume that each rocket at every moment of time either stands still waiting for an order, or moves through space, fulfilling an order. The movement starts after the order is accepted and ends after the order is canceled or completed. In one minute, several events related to the same rocket cannot occur.
Input Format:
The first line contains an integer N(2 ≤ N ≤ 200 000) — the number of entries in the log. The following N lines contain log entries in the format day hour minute id status: day(1 ≤ d ≤ 365) — day number (through numbering from the beginning of the calendar year); hour(0 ≤ h < 24) — hours; minute(0 ≤ m < 60) — minutes; id(0 ≤ id ≤ 10<sup>9</sup>) — unique missile identifier; status ∈ {A, B, S, C} is a letter denoting the type of event.
Output Format:
In a single line print the total time of movement on orders separated by a space for each rocket mentioned in the log. Data must be output in ascending order of missile identifiers.
3) algor3 - You need to know the final structure of the tree after all the changes that have occurred to it. Get the resulting tree structure.
Input Format:
The first line contains two integers N and Q (1 ≤ N ≤ 750; 1 ≤ Q ≤ 10<sup>6</sup>) — the number of vertices in the tree and the number of changes that have occurred to the tree. The next line contains Q integers v<sub>1</sub>, v<sub>2</sub>, … , v<sub>q</sub> (1 ≤ v<sub>i</sub> ≤ N), where v<sub>i</sub> is the number of the vertex that exchanged places with its ancestor on the i-th night.
Output Format:
In a single line, space-separated, it is required to display the numbers of tree vertices after all changes in the LV R format, starting from the root of the tree.
The format LV R (v) is defined recursively for the vertex v: 1. If the vertex v has a left child lv, then the entire subtree lv is first displayed in the format LV R (lv); 2. the number of the vertex v is displayed; 3. if the vertex v has a right child rv, then the entire subtree rv is displayed in the format LV R (rv);
4) algor4 - Your task is to find answers to several queries of one of two types: 1. Find the total cost of orders that started in a given period of time; 2. Find the total duration of orders that ended in a given period of time;
Input Format:
The first line contains one integer N (1 ≤ N ≤ 200 000) — the number of orders made by the service. Each of the next N lines contains information about one order in the format Start End Cost (1 ≤ Start < End ≤ 10<sup>9</sup>; 1 ≤ Cost ≤ 10<sup>9</sup>) — the start and end time of the order and the cost of the order. The next line contains one integer Q (1 ≤ Q ≤ 200 000) — the number of requests. Each of the following Q lines contains information about one request in the format Start End Type (1 ≤ Start ≤ End ≤ 10<sup>9</sup>; 1 ≤ Type ≤ 2) — start and end time of the interval and request type.
Output Format:
In a single space-separated line print Q integers — the answers to the questions in the order they were entered.
5) algor5 - You need to answer Q questions like: if you have X units of ingredient A and Y units of ingredient B left in your basement, can you make one vial of potion number S?
Input Format:
The first line contains a number N (3 ≤ N ≤ 200,000) — the total number of ingredients and recipes for derived potions. Ingredient A is number 1, B is number 2, all derived potions are numbered from 3 to N. The next N − 2 lines contain information about creating potions: the i-th line contains a list of ingredients for potion i + 2. The first number in the line Ki is the number of constituent parts. Then K<sub>i</sub> numbers P<sub>ij</sub> (1 ≤ P<sub>ij</sub> ≤ N, 1 ≤ j ≤ K<sub>i</sub>) follow after a space — the numbers of the components for making the potion i + 2. The components in the line can be repeated — each part is counted as many times as specified. It's guaranteed that ∑K<sub>i</sub> ≤ 1 000 000. The next line contains one integer Q (1 ≤ Q ≤ 200 000) — the number of questions. Each question is asked on a separate line in the format X Y S (0 ≤ X, Y ≤ 10<sup>9</sup>, 3 ≤ S ≤ N) — the number of ingredients A and B in the basement, respectively, as well as the number of the requested potion for making.
Output Format:
On a single line print a string of Q characters: 1 if it is possible to make a potion from the available ingredients; 0 otherwise.
