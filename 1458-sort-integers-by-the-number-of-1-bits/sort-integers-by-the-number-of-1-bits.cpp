class Solution {
public:
    vector<int> sortByBits(vector<int>& arr) {
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
        for(int i=0;i<arr.size();i++){
            pq.push({__builtin_popcount(arr[i]),arr[i]});
        }
        vector<int> ans;
        while(!pq.empty()){
            int val=pq.top().second;
            pq.pop();
            ans.push_back(val);

        }
        return ans;
    }
};