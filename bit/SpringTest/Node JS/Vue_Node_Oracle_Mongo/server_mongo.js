var http = require("http")
var express = require("express")
var app = express();
app.use(express.static("public"));
app.use(express.bodyParser());
app.use(app.router);


const MongoClient = require('mongodb').MongoClient;
const ObjectID = require('mongodb').ObjectID;
const assert = require('assert');
const url = 'mongodb://localhost:27017';
const dbName = 'bit';


app.post("/insertDept", function(req,res){
  console.log("등록")
  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);

    const client = new MongoClient(url);
    client.connect(function(err, client) {
    const db = client.db(dbName);
    db.collection('dept').insertOne(dept, function(err, r) {
      _id = r.insertedId;
      client.close();
      res.send("ok");
    });
  });

});



app.get("/listDept", function(req,res){
  const client = new MongoClient(url);
  client.connect(function(err, client) {
   assert.equal(null, err);
   const db = client.db(dbName);

   const col = db.collection('dept');
       col.find({}).toArray(function(err, docs) {
        client.close();
       res.send(docs);
     });
  });
});


app.post("/editDept", function(req, res){
  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);
  var q = {dno:dept.dno};
  var doc = { $set: {dname:dept.dname, dloc:dept.dloc} };

  const client = new MongoClient(url);
  client.connect(function(err, client){
      const db = client.db(dbName);
      db.collection("dept").updateOne(q, doc, function(err,re){
          client.close();
          res.send("1");
      });
  });
});


app.post("/deleteDept", function(req, res){

  console.log("삭제 요청됨");
  var body = req.body;
  var dept = JSON.parse(Object.keys(body)[0]);
  console.log(dept);
  var doc = {dno:dept.dno};
  console.log(doc);


    MongoClient.connect(url, function(err, db) {
      if (err) throw err;
      var dbo = db.db(dbName);
      dbo.collection("dept").deleteOne(doc, function(err, obj) {
        if (err) throw err;
        db.close();
        res.send("1");
      });
    });
});

http.createServer(app).listen(52273, function(){
  console.log("서버 가동됨");
});
