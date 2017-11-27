package maze;

public class DisjSet{
    private int[] s;
    public DisjSet(int numElements){
        s = new int[numElements];
        for(int i = 0; i < s.length; i++){
            s[i] = -1;
        }
    }

    public int find(int x){
        if(s[x] < 0)
            return x;
        else
            return s[x] = find(s[x]);
    }

    public void unionRooms(int roomA, int roomB){
        if(s[roomB] < s[roomA])
            s[roomA] = roomB;
        else{
            if(s[roomA] == s[roomB]){
                s[roomA]--;
            }
            s[roomB] = roomA;
       }
   }
}