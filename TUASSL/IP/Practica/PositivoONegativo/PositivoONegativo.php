<?php
/*
* Estructuras de control repetitivas, ciclo definido.                           
* Notación UpperCammelCase. Indentación 2. Pseudocódigo.                        
* Santino Fuentes, 2022.
 */

/*
* @param
* int $J
* @var
* double $Numero
* @return
* Ø
*/
function AnalizarSecuencia($J)
{
	for ($I=1; $I<=$J; $I++)
	{
		echo("Ingrese un número:\n");
		$Numero=trim(fgets(STDIN)); 
		if ($Numero>0)
		{
			echo($Numero." Es positivo.\n");
		}
		elseif ($Numero==0)
		{
			echo($Numero." Es igual a cero.\n");
		}
		else
		{
			echo($Numero." Es negativo.\n");
		}
	}
}

/*
* @var
* int $Cantidad
* double $N
* @return
* Ø
*/
echo("¿Cuántos números desea procesar?:\n");
$Cantidad=trim(fgets(STDIN));
AnalizarSecuencia($Cantidad);
?>
