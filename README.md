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
