#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class duplicate {
public:
    std::string Solution(const std::string &text1, const std::string &text2);
    std::string Solution1(const std::string &text1, const std::string &text2);
};

std::string duplicate::Solution(const std::string &text1, const std::string &text2) {
    int maxLength = 0;
    int lengthA = text1.length();
    int lengthB = text2.length();
    int tempLength = 0;
    int endIndex = 0;

    for (int i = 0; i < lengthA; ++i) {
        for (int j = 0; j < lengthB; ++j) {
            int tempI = i;
            int tempJ = j;
            tempLength = 0;

            while (tempI < lengthA && tempJ < lengthB && text1[tempI] == text2[tempJ]) {
                ++tempLength;
                ++tempI;
                ++tempJ;
            }

            if (tempLength > maxLength) {
                maxLength = tempLength;
                endIndex = tempI - 1;
            }
        }
    }

    if (maxLength == 0) {
        return "";
    } else {
        return text1.substr(endIndex - maxLength + 1, maxLength);
    }
}

std::string duplicate::Solution1(const std::string &text1, const std::string &text2) {
    int lengthA = text1.length();
    int lengthB = text2.length();
    std::vector<std::vector<int>> dp(lengthA + 1, std::vector<int>(lengthB + 1, 0));

    int maxLength = 0;
    int endIndex = 0;
    for (int i = 1; i <= lengthA; i++) {
        for (int j = 1; j <= lengthB; j++) {
            if (text1[i - 1] == text2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                if (dp[i][j] > maxLength) {
                    maxLength = dp[i][j];
                    endIndex = i - 1;
                }
            }
        }
    }
    if (maxLength == 0) {
        return "";
    } else {
        return text1.substr(endIndex - maxLength + 1, maxLength);
    }
}

extern "C" {
    duplicate* create_duplicate() {
        return new duplicate();
    }

    const char* duplicate_solution(duplicate* obj, const char* text1, const char* text2) {
        static std::string result; 
        result = obj->Solution(text1, text2);
        return result.c_str();
    }

    const char* duplicate_solution1(duplicate* obj, const char* text1, const char* text2) {
        static std::string result; 
        result = obj->Solution1(text1, text2);
        return result.c_str();
    }

    void destroy_duplicate(duplicate* obj) {
        delete obj;
    }
}
