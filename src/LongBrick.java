public class LongBrick extends TetrisBrick{
    int cur_row;
    int cur_col;
    public LongBrick( int cen_col) {
        initPosition(cen_col);
        super.colorNum = 6;
    }
    public void  initPosition(int center_col) {
        position = new int[][]{
                { 0,center_col-1},
                { 0, center_col},
                { 0, center_col+1},
                { 0, center_col+2}
        };
    }
    public void rotate(){
        cur_row = position[1][0];
        cur_col  = position[1][1];
        if(orientation == 1){position = new int[][]{
                { cur_row-1,cur_col},
                { cur_row, cur_col},
                { cur_row+1, cur_col},
                { cur_row+2, cur_col}
        };
            orientation =2;
        }
        else if(orientation == 2){
            position = new int[][]{
                    { cur_row,cur_col-1},
                    { cur_row, cur_col},
                    { cur_row, cur_col+1},
                    { cur_row, cur_col+2}
            };
            orientation =1;
        }

    }
    public void unrotate(){
        cur_row = position[1][0];
        cur_col  = position[1][1];
        if(orientation == 1){position = new int[][]{
                { cur_row-1,cur_col},
                { cur_row, cur_col},
                { cur_row+1, cur_col},
                { cur_row+2, cur_col}
        };
            orientation =2;
        }
        else if(orientation == 2){
            position = new int[][]{
                    { cur_row,cur_col-1},
                    { cur_row, cur_col},
                    { cur_row, cur_col+1},
                    { cur_row, cur_col+2}
            };
            orientation =1;
        }
    }

}
