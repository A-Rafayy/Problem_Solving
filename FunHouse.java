/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funhouse;

import java.util.Scanner;

/**
 *
 * @author arafay
 */
public class FunHouse {
    public static void print(char[][] house) {

        for(int i = 0; i < house.length; i++)
            System.out.println(new String(house[i]));
        }

        public static char[][] FindExitDoor(char[][] house) {
	
            int direction = 0;
            int r = 0;
            int c = 0;

            outer: for (int i = 0; i < house.length; i++)
		for (int j = 0; j < house[0].length; j++)
			if (house[i][j] == '*')
			{
                            r = i;
                            c = j;
                            break outer;
			}

            if (r == 0)
		direction = 1;
            if (r == house.length - 1)
		direction = 2;
            if (c == 0)
		direction = 3;
            if (c == house[0].length - 1)
		direction = 4;
	

            while (house[r][c] != 'x')
		{
                    if (house[r][c] == '.' || house[r][c] == '*')
			{
			if (direction == 1)
				r++;
			else if (direction == 2)
				r--;
			else if (direction == 3)
				c++;
			else if (direction == 4)
				c--;
			}

                    else if (house[r][c] == '/')
			{
			if (direction == 1)
				{c--; direction = 4;}
			else if (direction == 2)
				{c++; direction = 3;}
			else if (direction == 3)
				{r--; direction = 2;}
			else if (direction == 4)
				{r++; direction = 1;}
			}

                    else if (house[r][c] == '\\')
			{
			if (direction == 1)
				{c++; direction = 3;}
			else if (direction == 2)
				{c--; direction = 4;}
			else if (direction == 3)
				{r++; direction = 1;}
			else if (direction == 4)
				{r--; direction = 2;}
			}
		}

		house[r][c] = '&';
		return house;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int houses = 0;

        while (true)
	{
            houses++;
            int W = sc.nextInt();
            int L = sc.nextInt();

            if (L == 0 && W == 0)
		break;

            char[][] house = new char[L][W];

            for (int i = 0; i < L; i++)
		{
		String row = sc.next();

		for (int j = 0; j < W; j++)
			house[i][j] = row.charAt(j);
		}

            System.out.println("HOUSE " + houses);
            print(FindExitDoor(house));
	}

    sc.close();
    }
}
