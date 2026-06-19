
-- Inserta al menos cinco nuevos estudiantes en la tabla «estudiantes».
INSERT INTO estudiantes(nombre,edad)
VALUES('Fernanda', 28),
      ('Mario', 35),
      ('Camila', 26),
      ('Benjamin', null),
      ('Dafne', 33),
      ('Jaime', 44),
      ('Rodrigo', null),
      ('Sebastian', 25);
    
  -- Inserta al menos cuatro nuevos cursos en la tabla «cursos».
INSERT INTO cursos(nombre,duracion)
VALUES('Marketing Digital', 4),
	  ('Excel Avanzado', 4),
      ('Análisis de Datos', 5),
      ('Comercio Electrónico', 4),
      ('Gestión de Proyeto', 5),
      ('Computación Basica', 3); 
    
-- Asociar a cuatro de los estudiantes a al menos dos de los cursos dados de alta.
INSERT INTO inscripciones(estudiantes_id_estudiante, cursos_id_curso)
VALUES(3, 5),
      (8, 3),
      (1, 1),
      (3, 4),
      (6, 1),
      (2, 6),
      (6, 3),
	  (2, 3),
      (1, 4),
      (4, 1);
      
-- Proyecta a todos los estudiantes y sus respectivos cursos
SELECT estudiantes.nombre AS nombre_estudiante, cursos.nombre AS nombre_curso
FROM estudiantes
JOIN inscripciones ON inscripciones.estudiantes_id_estudiante = id_estudiante
JOIN cursos ON inscripciones.cursos_id_curso = id_curso
ORDER BY estudiantes.id_estudiante ASC;

-- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
SELECT cursos.nombre AS nombre_curso, estudiantes.nombre AS nombre_estudiante
FROM estudiantes
LEFT JOIN inscripciones ON inscripciones.estudiantes_id_estudiante = id_estudiante
LEFT JOIN cursos ON inscripciones.cursos_id_curso = id_curso
WHERE cursos.nombre = 'Marketing Digital';

-- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
SELECT estudiantes.nombre AS nombre_estudiante, cursos.nombre AS nombre_curso
FROM estudiantes
LEFT JOIN inscripciones ON inscripciones.estudiantes_id_estudiante = id_estudiante
LEFT JOIN cursos ON inscripciones.cursos_id_curso = id_curso
WHERE estudiantes.nombre = 'Jaime';

-- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
SELECT cursos.nombre, COUNT(*) AS num_estudiantes
FROM estudiantes JOIN inscripciones ON inscripciones.estudiantes_id_estudiante = id_estudiante
JOIN cursos ON inscripciones.cursos_id_curso = id_curso
GROUP BY cursos.nombre;

-- Encuentra los estudiantes que no están inscritos en ningún curso.
SELECT estudiantes.nombre AS estudiantes_no_inscritos_a_cursos
FROM estudiantes  LEFT JOIN inscripciones ON estudiantes_id_estudiante = id_estudiante
LEFT JOIN cursos ON inscripciones.cursos_id_curso = id_curso
WHERE inscripciones.estudiantes_id_estudiante IS NULL;

      