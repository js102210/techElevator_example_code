import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: { posts: [
    {
      author: "ajke",
      post: "anime was a mistake",
      valueToHumanity: false
    }
  ]
  },
  mutations: {
  },
  actions: {
  },
  modules: {
  }
})
