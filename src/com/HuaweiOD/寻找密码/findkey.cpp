#include <iostream>
#include <vector>
#include <sstream>
#include <string>
#include <map>

class findkey
{
public:
    std::string Solution(const std::string &words);

private:
    std::vector<std::string> splitWords(const std::string &words);
};

std::vector<std::string> findkey::splitWords(const std::string &words)
{
    std::vector<std::string> wordList;
    std::string word;
    std::istringstream iss(words);
    while (iss >> word)
    {
        wordList.push_back(word);
    }
    return wordList;
}

std::string findkey::Solution(const std::string &words)
{
    std::vector<std::string> res;
    res = splitWords(words);
    std::map<std::string, int> map;
    for (auto &it : res)
    {
        map[it]++;
    }
    int maxTimes = 0;
    std::string result;
    for (auto &word : res)
    {
        std::string temp_word = word;
        bool valid = true;
        while (!temp_word.empty())
        {
            temp_word.pop_back();
            if (!temp_word.empty() && !map.count(temp_word))
            {
                valid = false;
                break;
            }
        }
        if (valid && (result.empty() || word > result))
        {
            result = word;
        }
    }
    return result;
}

extern "C" {
    findkey* create_findkey() {
        return new findkey();
    }

    const char* findkey_solution(findkey* obj, const char* words) {
        // Using a static string for the result
        static std::string result;
        result = obj->Solution(words);
        return result.c_str();
    }

    void destroy_findkey(findkey* obj) {
        delete obj;
    }
}