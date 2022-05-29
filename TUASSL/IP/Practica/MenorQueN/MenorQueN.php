<?php
/*
* Estructuras de control repetitivas con ciclo definido. TP# 6.3.
* Notación UpperCammelCase. Indentación 2. PHP.
* Santino Fuentes, 2022.
*/
/*
* @param
* int $N
* @return
* Ø
*/
function PositivosMenoresQueN($N)
{
	for ($i=1; $i<$N; $i++)
	{
		echo(" ".$i.",");
	}
}
/*
* @var
* int $Numero
* @return
* Ø
*/
echo("Ingrese un número positivo:");
$Numero=trim(fgets(STDIN));
if ($Numero>0)
{
	echo("\nLos números positivos menores que ".$Numero." son: ");
	PositivosMenoresQueN($Numero);
}
else
{
	echo("\nPor favor, entienda que no hay números positivos menores\r
a un número negativo, o cero. Reinicie e ingrese un número positivo.\n");
 
}
?>
