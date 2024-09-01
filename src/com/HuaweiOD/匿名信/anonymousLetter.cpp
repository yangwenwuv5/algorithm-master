#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <unordered_set>

class anonymousLetter
{
public:
    bool Solution(std::vector<std::string> nesspaper, std::vector<std::string> letter);
};

bool anonymousLetter::Solution(std::vector<std::string> nesspaper, std::vector<std::string> letter)
{
    std::unordered_set<std::string> words;
    for (auto it : nesspaper)
    {
        std::sort(it.begin(), it.end());
        words.insert(it);
    }
    std::cout << "Contents of the words set: ";
    for (const auto &word : words)
    {
        std::cout << word << " ";
    }
    std::cout << std::endl;
    for (auto it : letter)
    {
        std::sort(it.begin(), it.end());
        if (!words.count(it))
        {
            return false;
        }
    }
    return true;
}

extern "C"
{
    // Create object
    anonymousLetter *create_anonymousLetter()
    {
        return new anonymousLetter();
    }

    // Solution function
    bool anonymousLetter_Solution(anonymousLetter *t, const char **nesspaper, int nesspaper_size, const char **letter, int letter_size)
    {
        std::vector<std::string> nesspaper_vec(nesspaper, nesspaper + nesspaper_size);
        std::vector<std::string> letter_vec(letter, letter + letter_size);
        return t->Solution(nesspaper_vec, letter_vec);
    }

    // Destroy object
    void destroy_anonymousLetter(anonymousLetter *t)
    {
        delete t;
    }
}