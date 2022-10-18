# algorithms
my solutions for some algorithmic tasks
1) algor1 - Your task is to help calculate for each candidate his cipher. 
Input Format:
The first line contains the number N(1 ≤ N ≤ 10 000) — the number of candidates and ciphers.
This is followed by N lines in CSV format (f<sub>j</sub> ,i<sub>j</sub>, o<sub>j</sub>, d<sub>j</sub>, m<sub>j</sub>, y<sub>j</sub>) — information about the candidates: Last name f<sub>j</sub>, first name i<sub>j</sub> and patronymic oj(1 ≤ ∣f<sub>j</sub>∣, ∣i<sub>j</sub>∣, ∣o<sub>j</sub>∣ ≤ 15) — strings consisting of upper and lower case Latin letters; birthday d<sub>j</sub>, month of birth mj<sub>j</sub> and year of birth y<sub>j</sub> are integers giving a valid date between January 1, 1950 until December 31, 2021.
Output Format:
In a single line print N lines of k1<sub>1</sub>, k<sub>2</sub>, … , k<sub>N</sub> , where k<sub>j</sub> is the cipher of the j-th candidate (in upper case). Candidates are numbered 1 to N in order of entry.
