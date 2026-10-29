class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i, visited, isConnected, n);
                count++;
            }
        }
        return count;
    }
    public static void bfs(int i, boolean[] visited, int[][] isConnected, int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size()>0){
            int front = q.remove();
            for (int j=0;j<n;j++){
                if(isConnected[front][j]==1 && !visited[j]) {
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
}