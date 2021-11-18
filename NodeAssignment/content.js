const http=require('http');

//create server object

http.createServer((req,res)=>{
    let filePath=path.join(__dirname,"public",req.url==="/"?"index.html" :req.url);
}).listen(5000,()=>console.log('Server running....'));