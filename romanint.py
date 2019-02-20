class romanint:
    def roman(self, s):
        s=str(input("enter the roman characters"))
        val1 = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        val2 = 0
        for i in range(len(s)):
            if i > 0 and val1[s[i]] > val1[s[i - 1]]:
                val2 += val1[s[i]] - 2 * val1[s[i - 1]]
            else:
                val2 += val1[s[i]]
        return val2

print(romanint().roman('s'))
print(romanint().roman('s'))
print(romanint().roman('s'))
