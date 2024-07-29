#Largest of 3

#!/bin/bash
echo enter 1st number
read num1
echo enter 2nd number
read num2
echo enter 3rd number
read num3
if(($num1 \> $num2))
then
	if(($num1 \> $num3))
	then
	echo $num1 is largest
	fi
elif(($num2 \> $num1))
then
	if(($num2 \> $num3))
	then
	echo $num2 is largest
	fi
else
echo $num3 is largest
fi