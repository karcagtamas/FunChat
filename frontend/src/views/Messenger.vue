<template>
  <div class="messenger">
    <h2>Messenger</h2>
    <div class="message-panel">
      <div class="header"></div>
      <div class="messages">
        <MessageComponent
          :key="message.id"
          v-for="message in messages"
          :message="message"
        ></MessageComponent>
      </div>
      <div class="action"></div>
    </div>
  </div>
</template>

<script>
import { Options, Vue } from "vue-class-component";
import MessageComponent from "@/components/MessageComponent";
import { MessageModel } from "@/models/MessageModel";

@Options({
  components: { MessageComponent },
  data: () => {
    return { messages: [] };
  },
})
export default class Messenger extends Vue {
  created() {
    this.messages = [new MessageModel("Szia!"), new MessageModel("Hi!")];
  }
}
</script>

<style scoped>
.messenger {
  display: flex;
  flex-direction: column;
  align-items: center;
  align-content: center;
  vertical-align: center;
  justify-content: center;
  height: 100%;
  width: 60%;
  margin: auto;
}

.message-panel {
  width: 100%;
}
</style>
