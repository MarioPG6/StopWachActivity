# Ciclo de Vida de las Actividades en Android

## Objetivo
Este proyecto tiene como objetivo explorar el ciclo de vida de las actividades en Android y su impacto en el comportamiento de una aplicación. Se analizarán los métodos clave del ciclo de vida, cómo gestionar estados y cómo optimizar el rendimiento de la aplicación.

## Presentación
El desarrollo se centra en la implementación del ciclo de vida de actividades dentro de un proyecto en Android Studio. Se revisan conceptos esenciales como el método `onCreate()`, la persistencia del estado con `onSaveInstanceState()` y la interacción entre actividades mediante Intents.

## Desarrollo
### Aspectos Clave Trabajados
#### Ciclo de Vida de una Actividad
- Comprensión de los estados de una actividad en Android.
- Implementación de métodos como `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onDestroy()`.
- Manejo de interrupciones y recreación de actividades.

#### Persistencia de Estado
- Uso de `onSaveInstanceState()` para almacenar datos temporales.
- Recuperación de datos con `onCreate(Bundle savedInstanceState)`.
- Uso de `Bundle` para guardar variables importantes.

#### Interacción entre Actividades
- Uso de `Intent` para navegar entre actividades.
- Implementación de `startActivity()` para iniciar nuevas pantallas.
- Paso de datos entre actividades mediante `Intent.putExtra()`.

#### Implementación de un Cronómetro
- Uso de `Handler` y `Runnable` para programar tareas repetitivas.
- Implementación de `post()` y `postDelayed()` para manejar la ejecución en segundo plano.
- Creación de una interfaz con botones para iniciar, pausar y reiniciar el cronómetro.

## Ejemplo de Funcionamiento
1. La aplicación inicia y muestra la actividad principal.
2. Se puede iniciar un cronómetro que se actualiza cada segundo.
3. Se permite la navegación entre actividades y el mantenimiento del estado del cronómetro.
4. El estado del cronómetro se guarda cuando la actividad es destruida y se restaura cuando es recreada.

## Imágenes de Funcionamiento
![image](https://github.com/user-attachments/assets/a47f6436-3c0c-4399-8dbe-7087f0a6351d)

![image](https://github.com/user-attachments/assets/737e7adc-622a-44e7-82a1-2b677af33d49)


## Conclusión
Este proyecto demuestra la importancia de manejar correctamente el ciclo de vida de las actividades en Android, garantizando una experiencia de usuario fluida y eficiente.

## Referencias
- [Documentación oficial del ciclo de vida de actividades en Android](https://developer.android.com/guide/components/activities/activity-lifecycle)
- [Guía de gestión del estado en Android](https://developer.android.com/topic/libraries/architecture/viewmodel)

