class Solution {
public:
    bool isValid(string s) {
        vector<char>v;
        for(char i:s)
        {
            if(i=='('||i=='{'|| i=='[')
            {
                v.push_back(i);
            }
            else
            {
                if(v.empty())
                {
                    return false;
                }
                else
                {
                    char p= v.back();
                    if(i==')'&& p!='('||i==']'&& p!='['||i=='}'&& p!='{')
                    {
                        return false;
                    }

                }
                v.pop_back();
            }
            
        }
      return v.empty();  
    }
};
