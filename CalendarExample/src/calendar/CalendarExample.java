package calendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;


public class CalendarExample {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1992, Calendar.JUNE, 04);

		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("la fecha de nacimiento de Lucy es " + sdf.format(cal.getTime()));
		
		System.out.println("datos a obtener");
		System.out.println("la fecha de nacimiento de Lucy es " + cal.get(Calendar.YEAR));
		System.out.println("el mes de nacimiento de Lucy es " + cal.get(Calendar.MONTH));
		System.out.println("el diaa de nacimiento de Lucy es " + cal.get(Calendar.DATE));
		System.out.println("el diaa de nacimiento de Lucy es " + cal.get(Calendar.DAY_OF_WEEK));

		int año = 1992;
		int mes = 06;
		int dia = 04;
		//System.out.println("el ultimo dia del mes" + getUltimodiaDelMes(mes - 1, año));
		
		Calendar FechaIngresadaPorUsuario = Calendar.getInstance();
		  FechaIngresadaPorUsuario.set(año, mes, dia);

		  
		  System.out.println(sdf.format(FechaIngresadaPorUsuario.getTime()));
		  
		  //System.out.println("la fecha de nacimiento de Lucy es " + cal);
		// Obtener la hora actual
			LocalDate now = LocalDate.now();
			
			 // el dia
			int today = now.getDayOfMonth();
			System.out.println(today);
			
			 // Obtenga el primer dia del mes de la fecha ingresada
			Calendar PrimerDia = Calendar.getInstance();
			PrimerDia.set(año, mes, 1);
			PrimerDia.add(Calendar.MONTH, -1);
			
			LocalDate monthDay = now.minusDays(today-1);
			System.out.println(monthDay);
			
			 // Obtener puesto en el dia de la semana contando desde 1, primer, segundo
			
			int weekday = monthDay.getDayOfWeek().getValue();
			System.out.println(weekday);
			 // Salida del encabezado del calendario
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");

			 // Vaciar los días anteriores (pertenecientes al mes anterior)
			 // numOfLine registra el número de días (incluido el tiempo vacío) impresos por la línea
			int numOfLine = 0;
			for (int i=1; i<weekday; i++) {
				System.out.print("    ");
				numOfLine ++;
			}
			
			 // Ciclo de impresión hasta que se imprima el día del mes		
			while(true)
			{
				 // Obtenga lo que debe imprimirse es el día del mes
				int date = monthDay.getDayOfMonth();
				
				 // El número de bits de impresión debe ser el mismo
				System.out.printf("%3d",date);
				
				 // Si es este día, imprime uno más *
				if (date == now.getDayOfMonth()) {
					System.out.print("*");
				}
				else System.out.print(" ");
				
				 // Actualiza el número de días que el banco ha impreso
				numOfLine ++;	
				
				 // Actualiza la fecha al día siguiente
				monthDay = monthDay.plusDays(1);
				
				 // Si el banco ha impreso 7 días, envuelva
				if (numOfLine == 7) {
					System.out.print("\n");
					numOfLine = 0;
				}
				
				 // Si el mes ha sido impreso, salga del ciclo
				if (monthDay.getMonthValue() != now.getMonthValue())
					break;
			}

		  
		  
	
	}
}		 		
//		System.out.println("Ingresa el año");
//		Scanner sc = new Scanner(System.in);
//		int año = sc.nextInt();
//		System.out.println("Ingresa el mes");
//		int mes = sc.nextInt();
//		
//		calendarPrint(mes,año, dia);
//		
//		sc.close();

		

		
		
	/*
	 * 
	 * public static void calendarPrint(int pMes,int pAño, int pDiaAResaltar) {
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
			
			/*Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingresa el año");
			int año = sc.nextInt();
			
			System.out.println("Ingresa el mes");
			int mes = sc.nextInt();
			
			System.out.println("Ingresa el dia");
			int dia = sc.nextInt();
			 sc.close();
			*/
		/*private static int getUltimodiaDelMes(int pMes, int pAño){ 
			  Calendar cal = Calendar.getInstance(); cal.set(pAño, pMes, 1); 
		int ultimoDia = 1;
			  while(cal.get(Calendar.MONTH)== pMes) {
				  ultimoDia = cal.get(Calendar.DATE);
				  cal.add(Calendar.DATE , 1);
			  
			  } return ultimoDia;
		
		}
		*/
	 





