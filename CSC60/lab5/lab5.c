/*-------------------------------------------------------*/
/* Shammah Thao                                       */
/* LAB 5, functions that "return" more than one value    */
/* Given the radius, find the area and the circumference */
/* of a circle                                           */

#include "lab5.h"
#include <stdio.h>
#include <math.h>

int main(void)
{
    double radius;	/* radius of a circle */
    double area;	/* area of the circle */	
    double cir;		/* circumference of the circle */

    FILE * data_in;     /* input file pointer */
    FILE * data_out;    /* output file pointer */


	/* Open the two required files */
    data_in = fopen("lab5.dat", "r");
    if (data_in == NULL)
    {
       printf("Error on fopen file %s \n", "lab5.dat");
       exit(EXIT_FAILURE);
    }

    data_out = fopen("lab5.o", "w");
    if (data_out == NULL)
    {
       printf("Error on fopen file %s \n", "lab5.o");
       exit(EXIT_FAILURE);
    }
    
    /* Print headers */
    fprintf(data_out, "\nShammah Thao.  Lab 5. \n\n");
    fprintf(data_out, " Radius	    Area     Circumference  \n");
    fprintf(data_out, "--------  --------  --------------- \n");

	/* Loop thru the values to compute the answers  */
    while ((fscanf(data_in, "%lf", &radius))== 1)
    {
	compute(radius, &area, &cir);

        fprintf(data_out,"%7.2f  %8.2f  %11.2f  \n",
                radius, area, cir);
    }
    fprintf(data_out, "\n");
    fclose(data_in);
    fclose(data_out);
    return EXIT_SUCCESS;
}
/*-----------------------------------------------------------*/
