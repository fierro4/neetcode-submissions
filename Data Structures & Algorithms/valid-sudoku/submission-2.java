class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char piece=board[r][c];
                if(piece=='.') continue;
                int boxidx=(r/3)*3+(c/3);
                if( (rows[r].contains(piece)) || (cols[c].contains(piece)) || (boxes[boxidx].contains(piece))){
                    return false;
                }
                else{
                    rows[r].add(piece);
                    cols[c].add(piece);
                    boxes[boxidx].add(piece);
                }
            }
        }
        return true;
    }
}
