#include <iostream>
#include <sstream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>

class rearrange {
public:
    std::string Solution(const std::string &words);
private:
    std::vector<std::string> splitWords(const std::string &words);
};

std::vector<std::string> rearrange::splitWords(const std::string &words) {
    std::vector<std::string> wordList;
    std::string word;
    std::istringstream iss(words);
    
    while (iss >> word) {
        wordList.push_back(word);
    }
    
    return wordList;
}

std::string rearrange::Solution(const std::string &words) {
    std::vector<std::string> wordList = splitWords(words);

    for (auto &word : wordList) {
        std::sort(word.begin(), word.end());
    }

    std::map<std::string, int> wordCount;
    for (const auto &w : wordList) {
        wordCount[w]++;
    }

    std::vector<std::pair<std::string, int>> wordCountVector(wordCount.begin(), wordCount.end());

    auto compare = [](const std::pair<std::string, int>& a, const std::pair<std::string, int>& b) {
        if (a.second != b.second)
            return a.second > b.second;
        if (a.first.size() != b.first.size())
            return a.first.size() < b.first.size();
        return a.first < b.first;
    };

    std::sort(wordCountVector.begin(), wordCountVector.end(), compare);

    std::ostringstream oss;
    for (const auto &pair : wordCountVector) {
        for (int i = 0; i < pair.second; ++i) {
            oss << pair.first << " ";
        }
    }

    std::string result = oss.str();
    if (!result.empty()) {
        result.pop_back();
    }

    return result;
}

// C interface
extern "C" {
    rearrange* create_rearrange() {
        return new rearrange();
    }

    const char* rearrange_solution(rearrange* obj, const char* words) {
        static std::string result;
        result = obj->Solution(words);
        return result.c_str();
    }

    void destroy_rearrange(rearrange* obj) {
        delete obj;
    }
}