# camel-example
Example project, which demonstrates some capabilites of Apache Camel integration framework.
Code reads XML files with payment information from folder, gets employee info by account in account service.
Then payments is stored in DB(embedded H2) and info is aggregated by account for mail notifications.

# How to run
То run project invoke
```
mvn camel:run
```

# Enable mail notifications
To enable mail set
```
mail.use=true
```
in _app.properties_ and configure
```
mail.uri=smtp://localhost:25
```
according to http://camel.apache.org/mail.html, e.g
```
smtp://[username@]host[:port][?password=somepwd]
```
You can use fake SMTP server to run locally: https://nilhcem.github.io/FakeSMTP/

