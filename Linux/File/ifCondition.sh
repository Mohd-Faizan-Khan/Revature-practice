#Largest of 2

#!/bin/bash
echo Enter first number
read num1
echo Enter second number
read num2
if(($num1 \> $num2))
then
echo $num1 is larger
elif(($num1 == $num2))
then
echo both numbers are equal
else
echo $num2 is larger
fi