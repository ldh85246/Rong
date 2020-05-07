var http = require("http")
var express = require("express")
var app = express();
app.use(express.static("public"));
app.use(express.bodyParser());
app.use(app.router);


app.post("/insertDept", function(req,res){
  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);

  var dno = dept.dno;
  var dname = dept.dname;
  var dloc = dept.dloc;

  var sql = "insert into dept values("+dno+", '"+dname+"', '"+dloc+"')";
  const oracledb = require('oracledb');
  oracledb.outFormat = oracledb.OUT_FORMAT_OBJECT;
  const mypw = "madang"  // set mypw to the hr schema password
  async function run() {
    let connection;
    try {
      connection = await oracledb.getConnection(  {
        user          : "c##madang",
        password      : mypw,
        connectString : "localhost:1521/XE"
      });

      console.log(sql);
      const result = await connection.execute(sql);
      connection.commit();
    //  console.log(result);
      console.log(result.rowsAffected);
      res.send("1");
    } catch (err) {
      console.error(err);
    } finally {
      if (connection) {
        try {
          await connection.close();
        } catch (err) {
          console.error(err);
        }
      }
    }
  }

  run();
  res.send("ok");
});

app.get("/listDept", function(req,res){
  const oracledb = require('oracledb');
  oracledb.outFormat = oracledb.OUT_FORMAT_OBJECT;
  const mypw = "madang"  // set mypw to the hr schema password
  async function run() {
    let connection;
    try {
      connection = await oracledb.getConnection(  {
        user          : "c##madang",
        password      : mypw,
        connectString : "localhost:1521/XE"
      });

      const result = await connection.execute(
        `select * from dept order by dno`
      );
    //  console.log(result);
  //    console.log(result.rows);

      var str = JSON.stringify(result.rows).toLowerCase();
      res.send( JSON.parse(str));
    } catch (err) {
      console.error(err);
    } finally {
      if (connection) {
        try {
          await connection.close();
        } catch (err) {
          console.error(err);
        }
      }
    }
  }

  run();
  //res.send("ok");
});


app.post("/editDept", function(req, res){

  console.log("수정요청");

  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);

  var dno = dept.dno;
  var dname = dept.dname;
  var dloc = dept.dloc;

  var sql = "update dept set dname='"+dname+"',dloc='"+dloc+"' where dno="+dno;
  const oracledb = require('oracledb');
  oracledb.outFormat = oracledb.OUT_FORMAT_OBJECT;
  const mypw = "madang"  // set mypw to the hr schema password
  async function run() {
    let connection;
    try {
      connection = await oracledb.getConnection(  {
        user          : "c##madang",
        password      : mypw,
        connectString : "localhost:1521/XE"
      });

      console.log(sql);
      const result = await connection.execute(sql);
      connection.commit();
    //  console.log(result);
      console.log(result.rowsAffected);
      res.send("1");
    } catch (err) {
      console.error(err);
    } finally {
      if (connection) {
        try {
          await connection.close();
        } catch (err) {
          console.error(err);
        }
      }
    }
  }
  run();
});


app.post("/deleteDept", function(req, res){
  console.log("삭제요청");
  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);

  var dno = dept.dno;

  var sql = "delete dept where dno="+dno;
  const oracledb = require('oracledb');
  oracledb.outFormat = oracledb.OUT_FORMAT_OBJECT;
  const mypw = "madang"  // set mypw to the hr schema password
  async function run() {
    let connection;
    try {
      connection = await oracledb.getConnection(  {
        user          : "c##madang",
        password      : mypw,
        connectString : "localhost:1521/XE"
      });

      console.log(sql);
      const result = await connection.execute(sql);
      connection.commit();
    //  console.log(result);
      console.log(result.rowsAffected);
      res.send("1");
    } catch (err) {
      console.error(err);
    } finally {
      if (connection) {
        try {
          await connection.close();
        } catch (err) {
          console.error(err);
        }
      }
    }
  }

  run();
});

http.createServer(app).listen(52273, function(){
  console.log("서버 가동됨");
});
