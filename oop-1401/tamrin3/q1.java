import java.util.Scanner;
public class Matrix {
    //number of rows of the matrix
    private int row;
    //number of columns of the matrix
    private int column;
    //all the elements stored in the matrix
    private int[][] elements;

    public void setRow(int r) {
        row = r;
    }
    public void setColumn(int c) {
        column = c;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    //all of the numbers stored in the matrix
    public int[][] getElements() {
        return elements;
    }
    //returns one special cell (by the adress of row and column of the cell)
    public int getElements(int i, int j) {
        return elements[i][j];
    }
    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    public Matrix(int row, int column) {
        this.setRow(row);
        this.elements = new int[row][column];
        for(int i=0; i<row; i++)
        {
            this.elements[i] = new int[column];
        }
        //this.column = column;
        this.setColumn(column);

    }

    //make Square Matrix
    public Matrix(int length) {
        this(length, length);
    }

    public Matrix(int[][] e) {
        this.elements = e;

    }

    public boolean add(Matrix m) {
        if(this.column != m.column || this.row != m.row)
        {
            return false;
        }
        else{
            for(int i=0; i<this.row; i++)
            {
                for(int j=0; j<this.column; j++)
                {
                    this.elements[i][j] += m.elements[i][j];
                }
            }
            return true;
        }
    }

    public boolean isSquareMatrix() {
        if(getRow() == getColumn())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public int det(int[][] arrayA) {
        if (!this.isSquareMatrix())
        {
            return -1;
        }
        else if(getRow() == 2){
            return (this.elements[0][0]*this.elements[1][1]-this.elements[0][1]*this.elements[1][0]);

        }
        else if(getRow() == 3)
        {
            int a = elements[0][0]*elements[1][1]*elements[2][2];
            int b = elements[0][1]*elements[1][2]*elements[2][0];
            int c = elements[0][2]*elements[1][0]*elements[2][1];

            int d = elements[0][2]*elements[1][1]*elements[2][0];
            int e= elements[0][1]*elements[1][0]*elements[2][2];
            int f = elements[1][2]*elements[2][1]*elements[0][0];
            return (a+b+c-d-e-f);
        }
        else{
            return -1;
             }
    }

    public void mulConst(int x) {
        for(int i =0 ;i<getRow(); i++)
        {
            for(int j=0; j<getColumn(); j++)
            {
                elements[i][j] *= x;
            }
        }
    }

    public boolean mulFeasibility(Matrix m) {
        if(this.getColumn() == m.getRow())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public Matrix mul(Matrix m) {
        if (mulFeasibility(m)) {
            Matrix result = new Matrix(this.getRow(), m.getColumn());
            for(int i=0; i <this.getRow(); i++)
            {
                for(int j=0; j < m.getColumn(); j++)
                {
                    for(int k=0; k< this.getColumn();k++)
                    {
                        result.elements[i][j] += this.elements[i][k] * m.elements[k][j];
                    }
                }
            }
            return result;
        }
        else{
            System.out.println("matrix is not valid for mult function");
            return null;
        }
    }

    public void toLowerTriangular() {
        if (isSquareMatrix()) {
            for (int i = 0; i < getRow(); i++)
                for (int j = 0; j < i; j++)
                    elements[i][j] = 0;
        }
    }

    public void toUpperTriangular() {
        if (isSquareMatrix()) {
            for (int i = 0; i < getRow(); i++)
                for (int j = getColumn() - 1; j > i; j--)
                    elements[i][j] = 0;
        }
    }

    public void showMatrix() {
        System.out.println("\n");
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++)
                System.out.print(getElements(i, j) + "   ");
            System.out.println();
        }
    }

    public void setElementsOfMatrix() {
        int n = this.getRow();
        int m = this.getColumn();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("element[" + i + "][" + j + "] = ");
                this.setElement(i, j, input.nextInt());
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows of matrix:");
        int n = input.nextInt();
        System.out.print("Enter columns of matrix:");
        int m = input.nextInt();
        Matrix matrix = new Matrix(n, m);
        matrix.setElementsOfMatrix();
        System.out.println("\nMatrix is:");
        matrix.showMatrix();
        System.out.println("\nDeterminant of matrix2 is: " + matrix.det(matrix.getElements()));
        input.close();
    }
}
