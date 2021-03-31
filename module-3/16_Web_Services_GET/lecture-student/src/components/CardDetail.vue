<template>
  <div>
    <h1>{{card.title}}</h1>
    <p>{{card.description}}</p>
    <comments-list v-bind:comments="card.comments"/>
    <div class="board-actions">
      <router-link v-bind:to="{name: 'Board', params: {id: $route.params.boardID}}">
        Board</router-link>
    </div>
  </div>
</template>

<script>
import boardService from '@/services/BoardService.js'
import CommentsList from '@/components/CommentsList.vue'

export default {
  name: "card-detail",
  data(){
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      }
    }
  },
  created(){
    boardService.getCard(this.$route.params.boardID, this.$route.params.cardID)
    .then(cardFromResponse => this.card = cardFromResponse)
  },
  components: {
    CommentsList
  }
};
</script>

  