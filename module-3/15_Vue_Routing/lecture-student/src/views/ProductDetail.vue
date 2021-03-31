<template>
  <div id="app" class="main">
    <h1>{{ product.name }}</h1>
    <p class="description">{{ product.description }}</p>
    <div class="actions">
      <a href="#">Back to Products</a>&nbsp;|
      <a href="#">Add Review</a>
    </div>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />
    </div>
    <review-list />
  </div>
</template>

<script>
import AverageSummary from '@/components/AverageSummary.vue'
import StarSummary from '@/components/StarSummary.vue'
//import AddReview from '@/components/AddReview.vue'
import ReviewList from '@/components/ReviewList.vue'
export default {
    //magic word-- happens when an instance of this component is created
    created(){
        const activeProductId = this.$route.params.id;
        this.$store.commit("SET_ACTIVE_PRODUCT", activeProductId);
    },
    computed: {
        product(){
            return this.$store.state.products.find(
                p=> p.id == this.$store.state.activeProduct
            )
        }
    },
    components: {
        AverageSummary,
        StarSummary,
       // AddReview,
        ReviewList
    }
}
</script>

<style>

</style>