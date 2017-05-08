package midTermPackage7;

public class Utils7 {
    private int column;
    private int rows;

    Utils7(){
        setColumn();
        setRows();
    }

    static int[][] populateDoubleArray(int inDoubleArray[][]){
        int[][] populatedDoubleArray = inDoubleArray;
        for(int col = 0; col < inDoubleArray.length; col++){
            for (int row = 0; row < inDoubleArray[col].length; row++){
                populatedDoubleArray[col][row] = (int)((Math.random() * 1000) + 1);
                System.out.println(populatedDoubleArray[col][row]);
            }
        }
        return populatedDoubleArray;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn() {
        int inValue = (int)((Math.random() * 10) +5);
        this.column = inValue;
    }

    public int getRows() {
        return rows;
    }

    public void setRows() {
        int inValue = (int)((Math.random() * 10) +5);
        this.rows = inValue;
    }
}
