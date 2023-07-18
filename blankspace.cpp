#include <iostream> 
#include <string>
#include <vector>
#include <algorithm> 

using namespace std;

vector<string> getSequence(string s) {
    vector<string> res;
    size_t startPos = 0;
    size_t endPos = 0;

    while (endPos != string::npos) {
        endPos = s.find("1", startPos);
        string substring = s.substr(startPos, endPos - startPos);
        substring.erase(remove(substring.begin(), substring.end(), ' '), substring.end());

        if (!substring.empty()) {
            res.push_back(substring);
        }

        if (endPos != string::npos) {
            startPos = endPos + 1;
        }
    }

    return res;
}

int main() {
    int t;
    cin >> t;

    while (t-- > 0) {
        int longest;
        int length;
        cin >> length;

        vector<string> inputStrings;

        while (length-- > 0) {
            string s;
            cin >> s;
            inputStrings.push_back(s);
        }

        string concatenatedString = "";
        for (const auto& s : inputStrings) {
            concatenatedString += s + " ";
        }

        vector<string> seq = getSequence(concatenatedString);
        if (seq.size() == 0) {
            cout << seq.size() << endl;
            continue;
        }

        sort(seq.begin(), seq.end());
        seq.back().erase(remove(seq.back().begin(), seq.back().end(), ' '), seq.back().end());

        cout << seq.back().size() << endl;
    }

    return 0;
}
