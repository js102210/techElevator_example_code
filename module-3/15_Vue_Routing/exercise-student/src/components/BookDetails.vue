<template>
  <div>
      <h1>{{book.title}}</h1>
      <h2>{{book.author}}</h2>
      <book-card v-bind:book = "book"/>
      <h4>{{book.read}}</h4>
   </div>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    created() {
        const activeBookIsbn = this.$route.params.isbn;
        this.$store.commit("SET_ACTIVE_BOOK", activeBookIsbn);
    },
    computed: {
        book() {
            return this.$store.state.activeBook;
        }
    },
    components: {
        BookCard
      
    
    }

}
</script>

<style>

</style>