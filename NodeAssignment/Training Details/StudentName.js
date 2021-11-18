const fs=require('fs');
const path=require('path');

//create folder with async call back function
fs.mkdir(path.join(__dirname,'/public'),{},function(err){
    if(err)throw err;
    console.log('')
})

fs.readFile(path.join(__dirname,'/public','hello.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});

fs.writeFile(path.join(__dirname,'public','hello.txt')
,'My text file contains'
,(err)=>{
    if(err) throw err;
    console.log('File written to...');
})
