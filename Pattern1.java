public class Pattern1 
{
    public static void main(String[] args)
     {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
//logic used for creating all patterns 
/*
 Step 1: Think about Rows

We want 5 rows → so our outer loop runs from 1 to n.

for (int i = 1; i <= n; i++) {
    ...
}

Step 2: Break Each Row into Two Parts

Each row has two things:

Spaces (to push stars to the right place)

Stars

So inside the outer loop, we’ll use two inner loops:

One for spaces

One for stars

Step 3: Count Spaces per Row

Look carefully:

Row 1 → 4 spaces before *
Row 2 → 3 spaces before * *
Row 3 → 2 spaces before * * *
Row 4 → 1 space before * * * *
Row 5 → 0 spaces before * * * * *

So formula:
 spaces = n - i

Step 4: Count Stars per Row

Row 1 → 1 star
Row 2 → 2 stars
Row 3 → 3 stars
Row 4 → 4 stars
Row 5 → 5 stars

So formula:
 stars = i

Step 5: Put It Together
int n = 5;
for (int i = 1; i <= n; i++) {
    // print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print("  "); // double space for better alignment
    }
    // print stars
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    // move to next line
    System.out.println();
}

Logic in Simple Words

Outer loop → how many rows.

First inner loop → how many spaces (depends on row number).
Second inner loop → how many stars (same as row number).
 */


     
    
