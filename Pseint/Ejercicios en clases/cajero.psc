Proceso caja
	
	Escribir "ingrese monto";
	leer monto;
	monto1<-trunc(monto/20000);
	resto<-monto%20000;
	Escribir "cantidad de 20000: ",monto1;
	monto2<-trunc(resto/10000);
	resto1<-resto%10000;
	Escribir "cantidad de 1000: ",monto2;
	monto3<-trunc(resto1/5000);
	resto2<-resto1%5000;
	Escribir "cantidad de 5000: ",monto3;
	monto4<-trunc(resto2/2000);
	resto3<-resto2%2000;
	Escribir "cantidad de 2000: ",monto4;
	monto5<-trunc(resto3/1000);
	resto4<-resto3%1000;
	Escribir "cantidad de 1000: ",monto5;
	monto6<-trunc(resto4/500);
	resto5<-resto4%500;
	Escribir "cantidad de 500: ",monto6;
	monto7<-trunc(resto5/100);
	resto6<-resto5%100;
	Escribir "cantidad de 100: ",monto7;
	monto8<-trunc(resto6/50);
	resto7<-resto6%50;
	Escribir "cantidad de 50: ",monto8;
	monto9<-trunc(resto7/10);
	resto8<-resto7%10;
	Escribir "cantidad de 10: ",monto9;
	monto10<-trunc(resto8/5);
	resto9<-resto8%5;
	Escribir "cantidad de 5: ",monto10;
	monto11<-trunc(resto9/1);
	Escribir "cantidad de 1: ",monto11;
	
FinProceso
