#include <iostream>
#include <string>
#include <algorithm>

class reverse
{
public:
    std::string solution(std::string words);

private:
    bool isPunctuation(char ch);
};

bool reverse::isPunctuation(char ch)
{
    return ch == ',' || ch == '.' || ch == '?' || ch == ' ' || ch == '!' ;
}

std::string reverse::solution(std::string word)
{
    std::string reversedWord;
    std::string temp;
    for (char ch : word)
    {
        if (isPunctuation(ch))
        {
            if (!temp.empty())
            {
                std::reverse(temp.begin(), temp.end());
                reversedWord += temp;
                temp.clear();
            }
            reversedWord += ch;
        }
        else
        {
            temp += ch;
        }
    }
    if (!temp.empty())
    {
        std::reverse(temp.begin(), temp.end());
        reversedWord += temp;
    }
    return reversedWord;
}

extern "C"
{
    // Create object
    reverse *create_reverse()
    {
        return new reverse();
    }

    // Solution function
    const char *reverse_solution(reverse *obj, const char *word)
    {
        static std::string result; // Static to keep the result alive after returning
        result = obj->solution(word);
        return result.c_str();
    }

    // Destroy object
    void destroy_reverse(reverse *obj)
    {
        delete obj;
    }
}