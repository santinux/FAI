<?php
/*
* Estructuras de control repetitivas, TP# 2.1.
* Notación UpperCammelCase. Indentación 2. PHP.
* Santino Fuentes, 2022.
*/
/*
* @var
* int $N
* @return
* Ø
*/
echo"Ingrese un número natural par:";
$N = trim(fgets(STDIN));
echo"Los números naturales pares menores o iguales que ".$N." son:";
NaturalesPares($N);

/*
* @param
* int $N
* @return
* int $NatPar
*/ 
function NaturalesPares ($N)
{
	for($i=0; $i<=$N; $i++)
	{
		$NatPar = (i*2);
		echo($NatPar." , ");
	}
}
?>
