<template>
  <div class="book-container">
    <book-card v-for="book in listOfBooks" v-bind:key="book.isbn" v-bind:book="book"/>
  </div>
</template>

<script>
import BookCard from "./BookCard";

export default {
  components: { BookCard },

    name: 'reading-list',
    computed: {
      listOfBooks(){
        return this.$store.state.books;
    }
}
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>