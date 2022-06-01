<?php
/*
* @param
* String $Decision
* @return
* Ø
*/
function CalculaPromedio($Decision)
{
	/*
	* @var
	* float $Sueldo
	* float $Promedio
	* int $Cantidad
	* String $Decision
	*/
	$Sueldo = 0;
	$Cantidad = 1;
	//$Promedio = 0;
	$Stop = "n";
	while ($Decision != $Stop)
	{
		echo("Ingrese un sueldo: $");
		$Sueldo = trim(fgets(STDIN));
		echo("\n¿Desea ingresar otro sueldo? (s/n): ");
		$Decision = trim(fgets(STDIN));
		//$Sueldo + $Sueldo;
		//$Cantidad + 1;
	}
	$Sueldo = $Sueldo + $Sueldo;
	$Cantidad + 1;
	$Promedio = ($Sueldo / $Cantidad);
	echo ("El promedio de los sueldos es: $".$Promedio.".");
}

/*
* @var
* String $Decision
* @return
* Ø
*/
echo ("\n¿Desea ingresar un sueldo? (s/n): ");
$Decision = trim(fgets(STDIN));
CalculaPromedio($Decision);
?>
