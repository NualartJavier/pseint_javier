Proceso sin_titulo
	Repetir
	  Escribir "Ingrese codigo de 4 digitos";
	  Leer dig;
	  dig1<- (dig/1000);
	  dig2<- (dig%1000);
	  dig2<- (dig2/100);
	  dig3<- (dig%100);
	  dig3<- (dig3/10);
	  dig4<- (dig%10)
	  dig4<- (dig4/1)
	  dig2<- trunc(dig2);
	  dig1<- trunc(dig1);
	  dig3<- trunc(dig3);
	  si (dig<1000 y dig<0)Entonces
		  Escribir "Codigo ingresado incorrecto";
	  FinSi
  Hasta Que (dig>0 y dig>1000) 
  dig1<- (dig1+7);
  dig1<- (dig1%10);
  dig2<- (dig2+7);
  dig2<- (dig2%10);
  dig3<- (dig3+7);
  dig3<- (dig3%10);
  dig4<- (dig4+7);
  dig4<- (dig4%10);
  
  Escribir "",dig3,dig4,dig1,dig2;
FinProceso
