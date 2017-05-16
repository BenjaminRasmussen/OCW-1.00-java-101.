package com.company;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class MatrixTest {
    public static void main(String argv[]) {
        Matrix mat1 = new Matrix(3, 3);
        Matrix mat2 = new Matrix(3, 3);
        mat1.setIdentity();
        mat2.setIdentity();
        Matrix res;

        res = mat1.add(mat2);

        System.out.println("mat1:");
        mat1.print();
        System.out.println("mat2:");
        mat2.print();
        System.out.println("mat1 + mat2:");
        res.print();

        Matrix mat3 = new Matrix(4, 2);
        Matrix mat4 = new Matrix(2, 3);
        Matrix res2;

        for (int i = 0; i < mat3.getNumRows(); i++)
            for (int j = 0; j < mat3.getNumCols(); j++)
                mat3.setElement(i, j, i * j);

        for (int i = 0; i < mat4.getNumRows(); i++)
            for (int j = 0; j < mat4.getNumCols(); j++)
                mat4.setElement(i, j, 2 * (i + j));

        res2 = mat3.mult(mat4);

        System.out.println("mat3:");
        mat3.print();
        System.out.println("mat4:");
        mat4.print();
        System.out.println("mat3 * mat4:");
        res2.print();

        Matrix res3;
        //mat3.scalarMult(2.0);
        System.out.println("mat3:");
        mat3.print();

    }
    }
