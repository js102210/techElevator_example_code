<template>
<div>
<form class="new-book-form">
<input type="text" class="title-input" value="Title" v-model="newBook.title"/>
<input type="text" class="author-input" value="Author" v-model="newBook.author"/>
<input type="text" class="isbn-input" value="ISBN" v-model="newBook.isbn"/><br>
<input type="submit" value="Submit" v-on:click.prevent="addBook">
</form>
</div>  
</template>

<script>

export default {
    name: "new-book-form",
    data(){
        return{
            newBook: {
                title : 'Title',
                author : 'Author',
                read : false,
                isbn : 'ISBN'
            }
        }
    },
    methods: {
        addBook(){
            this.$store.commit("ADD_BOOK", this.newBook);
            this.resetForm();
        },
        resetForm(){
            this.newBook = {
                title : 'Title',
                author : 'Author',
                read : false,
                isbn : 'ISBN'
            }
        }
    
    }

}
</script>
