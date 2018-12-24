# Репозиторий для разработки и использования автотестов HMI MasterSCADA4D (публичная копия)

[![N|Solid](https://upload.wikimedia.org/wikipedia/commons/b/bb/Logo_InSAT.jpg)](https://insat.ru/)

Данный репозиторий создан для разработки и использования автотестов HMI MasterSCADA4D. Для использования необходимо наличие на компьютере:

  - Среды разработки [IntelliijIDEA]
  - Для корректной работы рекомендуентся использовать jdk8
  - Установленные фреймворки Maven и [Allure]
# Содержание
1. [Проект] Intellij IDEA, содержащий пакеты testingTools и собственно код автотестов
2. Файловый архив [MS4Projects.rar] для MasterSCADA4DBeta
3. [Окружение], необходимое для автономного запуска
# Первичная настройка тестового окружения
1. Папку Drivers из [Enviroment], поместить папку в корень диска C
2. Скачать jdk8, установить, удостовериться что переменная JAVA_HOME указывает на директорию установки
    2.1 Если нет, зайти в свойства {Мой компьютер} > Дополнительные параметры системы > Переменные среды > Добавить/изменить переменную JAVA_HOME на путь к jdk
3. Запустить Powershell, выполнить следующие команды
```sh
Set-ExecutionPolicy RemoteSigned -scope CurrentUser
iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
scoop install git
scoop install maven
scoop install allure
```
4. При необходимости установить [IntelliijIDEA] Community
# Порядок запуска автотестов:
- Клонировать репозиторий на локальную машину. ([Основы работы с git])
- Разархивировать [MS4Projects.rar] в любую удобную директорию
- Содержимое папки Enviroment переместить в ту же директорию
- Запустить cmd от имени администратора (!), переместится в указанную выше директорию, выполнить следующие команды, дождаться их завершения:
```sh
downloadInstaller.bat
runserver.bat
load_projects.bat
```
Внимание! Переустановщик MasterSCADA написан для Windows10, поэтому первая команда может остановиться на этапе установки. В этом случае следует завершить установку вручную.
- (При желании) Открыть проект AutotestCode в IntelliJ IDEA, изучить код
- В Powershell открыть папку с содержимым AutotestCode и записать следующую строку:
```sh
mvn clean test
```
- Проект соберется и начнет тесты
- После окончания тестирования ввести команду
 ```sh
allure serve --port 2007
```
- Запустится репорт-сервер Allure. 
- После окончания работы остановить сервер сочетанием Ctrl+C в Powershell, удалить папку Server в директории с проектами и окружением
# Порядок разработки автотестов
- Клонировать репозиторий на локальную машину. ([Основы работы с git])
- (Обязательно) Создать новую ветку git, назвать ее именем своего идентивикатора в TFS. Если такая существует перейти в нее.
- Добавить тестовый проект MasterSCADA, на котором будет вестись тестирование, в архив MS4Projects.rar
- Добавить соответствующую информацию о проекте в UploadProjects.xml ([Enviroment])
- Добавить свой код автотеста
- Добавить свои изменения (за исключением .idea и *.iml), сделать коммит, загрузить его на удаленный сервер.
- На [странице проекта] перейти в свою ветку и предложить merge request


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [IntelliijIDEA]: <https://www.jetbrains.com/idea/download/#section=windows>
   [Maven]: <https://maven.apache.org/>
   [allure]: <https://docs.qameta.io/allure/#_get_started>
   [Проект]: <https://gitlab.com/qa_InSAT/hmi_tests/tree/master/AutotestsCode>
   [Окружение]: <https://gitlab.com/qa_InSAT/hmi_tests/tree/master/Enviroment>
   [Enviroment]: <https://gitlab.com/qa_InSAT/hmi_tests/tree/master/Enviroment>
   [Основы работы с git]: <http://dev-lab.info/2013/08/%D1%88%D0%BF%D0%B0%D1%80%D0%B3%D0%B0%D0%BB%D0%BA%D0%B0-%D0%BF%D0%BE-git-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%BA%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D1%8B-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD/>
   [странице проекта]: <https://gitlab.com/qa_InSAT/hmi_tests>
