#include <iostream>
#include<vector>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, m;
        cin >> n, m;
        vector<int> ch(m, 0);
        for (int i = n; i <= m; i++)
        {
            if (ch[i] == 0)
            {
                for (int j = i * i; j <= m; j += i)
                {
                    ch[i] = 1;
                }
            }
        }
        for (int i = n; i <= m; i++)
        {
            if (ch[i] == 0)
                cout << i << endl;
        }
        cout << endl;
    }
    return 0;
}