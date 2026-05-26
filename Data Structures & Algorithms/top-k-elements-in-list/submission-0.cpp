class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        
        vector<int>b;
        unordered_map<int,int>v;
        for(int i:nums)
        {
            v[i]++;

        }
           vector<pair<int,int>>a(v.begin(),v.end());
           sort(a.begin(),a.end(),[](pair<int,int> &a ,pair<int,int> &b){
            return a.second>b.second;
           });
           int count=0;
        for(auto &i :a)
        {
           if(count<k)
           
                b.push_back(i.first);
            count++;

        }
     return b;   
    }
};
