class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        int n = rooms.size();
        vector<bool> visited(n,false);
        visited[0] = true;
        queue<int> q;
        q.push(0);
        while(!q.empty()){
            int front = q.front();
            q.pop();
            for(int ele: rooms[front]){
                if(!visited[ele]){
                    q.push(ele);
                    visited[ele] = true;
                }
            }
        } 
        for(bool k: visited){
            if(!k) return false;
        }
        return true;
    }
};