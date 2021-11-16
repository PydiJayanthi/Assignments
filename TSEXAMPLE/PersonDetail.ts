import {PersonInterface} from './PersonInterface';

class PersonDetail implements PersonInterface{
    first:string;
    last:string;

    getFullName():string{
        return this.first+this.last;
    }
}