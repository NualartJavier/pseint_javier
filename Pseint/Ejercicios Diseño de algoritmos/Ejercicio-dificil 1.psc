Proceso sin_titulo
	Escribir "Ingrese numero de cuatro digitos";
	Leer num;
	dig1<-trunc(num/1000);
	dig2<-trunc((num%1000)/100);
	dig3<-trunc(((num%1000)%100)/10);
	dig4<-trunc(((num%1000)%100)%10);
	Escribir "La suma de los digitos es: ",dig1+dig2+dig3+dig4;
FinProceso
