CREATE TABLE account (
  id IDENTITY,
  account_number VARCHAR(20),
);

CREATE TABLE employee (
  id IDENTITY,
  firstname VARCHAR(255),
  lastname VARCHAR(255),
  account_id BIGINT,
  FOREIGN KEY (account_id) REFERENCES account(id)
);

INSERT INTO account(account_number) VALUES ('00000000000000000000');
INSERT INTO account(account_number) VALUES ('00000000000000000001');
INSERT INTO account(account_number) VALUES ('00000000000000000002');
INSERT INTO account(account_number) VALUES ('00000000000000000003');

INSERT INTO employee(firstname, lastname, account_id) SELECT 'Maxim', 'Belov', id FROM account WHERE account_number = '00000000000000000000';
INSERT INTO employee(firstname, lastname, account_id) SELECT 'Anna', 'Kharitonova', id FROM account WHERE account_number = '00000000000000000001';
INSERT INTO employee(firstname, lastname, account_id) SELECT 'Denis', 'Anfertev', id FROM account WHERE account_number = '00000000000000000002';
INSERT INTO employee(firstname, lastname, account_id) SELECT 'Alexander', 'Skryl', id FROM account WHERE account_number = '00000000000000000003';